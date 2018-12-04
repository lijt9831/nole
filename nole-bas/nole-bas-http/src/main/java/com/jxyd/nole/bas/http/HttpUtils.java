package com.jxyd.nole.bas.http;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpMethodParams;

import com.jxyd.nole.bas.log.Log;
import com.jxyd.nole.bas.log.LogFactory;



public class HttpUtils {

	private static final Log LOG = LogFactory.getLog(HttpUtils.class);
	private static final String DEFAULT_CHARSET = "UTF-8";
	private static final boolean REQUEST_SENT_RETRY_ENABLED = false;
	private static final int RETRY_COUNT = 3;
	private static final String MIME_JSON = "application/json";
	private static final String RN = System.getProperty("line.separator");

	private HttpUtils() {
		throw new AssertionError();
	}

	/**
	 * HTTP get method ,default charset of response body is UTF-8
	 * 
	 * @param uri
	 *            either an absolute or relative URI
	 * @return null or response string
	 * @author Wi
	 */
	public static String get(String uri) {
		return HttpUtils.get(uri, null);
	}

	/**
	 * HTTP get method
	 * 
	 * @param uri
	 *            either an absolute or relative URI
	 * @param charsetName
	 *            charset of response body
	 * @return null or response string
	 * @author Wi
	 */
	public static String get(String uri, String charsetName) {
		String result = null;
		BufferedReader br = null;
		// Create an instance of HttpClient.
		HttpClient client = new HttpClient();
		GetMethod method = null;
		try {
			// Create a method instance.
			method = new GetMethod(uri);

			// Provide custom retry handler is necessary
			method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
					new DefaultHttpMethodRetryHandler(RETRY_COUNT, REQUEST_SENT_RETRY_ENABLED));

			// Execute the method.
			int statusCode = client.executeMethod(method);

			if (statusCode != HttpStatus.SC_OK) {
				LOG.debug("Method failed: " + method.getStatusLine());
			}

			// Read the response body.
			InputStream is = method.getResponseBodyAsStream();
			InputStreamReader isr = new InputStreamReader(is, charsetName == null ? DEFAULT_CHARSET : charsetName);
			br = new BufferedReader(isr);
			StringBuffer sb = new StringBuffer();
			String l;
			while ((l = br.readLine()) != null) {
				sb.append(l);
				sb.append(RN);
			}
			result = sb.toString();
		} catch (HttpException e) {
			LOG.debug("Fatal protocol violation: [" + uri + "]", e);
		} catch (IOException e) {
			LOG.debug("Fatal transport error: [" + uri + "]", e);
		} catch (IllegalArgumentException e) {
			LOG.debug("Illegal argument error: [" + uri + "]", e);
		} catch (IllegalStateException e) {
			LOG.debug("Illegal state error: [" + uri + "]", e);
		} finally {
			// Release the connection.
			if (method != null) {
				method.releaseConnection();
			}
			if (br != null) {
				try {
					br.close();
				} catch (IOException ignore) {
				}
			}
		}
		return result;
	}

	/**
	 * HTTP post method ,default charset of response body is UTF-8
	 * 
	 * @param uri
	 *            either an absolute or relative URI
	 * @param paramMap
	 *            parameters to be used in the POST request body
	 * @param charsetName
	 *            charset of response body
	 * @return null or response string
	 * @author Wi
	 */
	public static String post(String uri, Map<String, String> paramMap) {
		return HttpUtils.post(uri, paramMap, null);
	}
	
	public static String post(String uri, Map<String, String> paramMap ,Map<String,String> headerMap) {
		return HttpUtils.post(uri, paramMap, headerMap, null);
	}

	/**
	 * HTTP post method
	 * 
	 * @param uri
	 *            either an absolute or relative URI
	 * @param paramMap
	 *            parameters to be used in the POST request body
	 * @param charsetName
	 *            the charset of response content
	 * @return null or response string
	 * @author Wi
	 */
	public static String post(String uri, Map<String, String> paramMap, Map<String,String> headerMap, String charsetName) {
		String result = null;
		BufferedReader br = null;
		// Create an instance of HttpClient.
		HttpClient client = new HttpClient();
		PostMethod method = null;

		try {
			// Create a method instance.
			method = new PostMethod(uri);
			
			// 添加 headers
			if(headerMap != null && headerMap.size() > 0) {
				Set<Entry<String, String>> entrySet = headerMap.entrySet();
				for (Entry<String, String> entry : entrySet) {
					method.addRequestHeader(entry.getKey(), entry.getValue());
				}
			}
			
			// Provide custom retry handler is necessary
			method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
					new DefaultHttpMethodRetryHandler(RETRY_COUNT, REQUEST_SENT_RETRY_ENABLED));
			if (paramMap != null) {
				Iterator<Entry<String, String>> it = paramMap.entrySet().iterator();
				while (it.hasNext()) {
					Entry<String, String> entry = it.next();
					method.addParameter(entry.getKey(), entry.getValue());
				}
			}
			// Execute the method.
			int statusCode = client.executeMethod(method);

			if (statusCode != HttpStatus.SC_OK) {
				LOG.debug("Method failed: " + method.getStatusLine());
			}

			// Read the response body.
			InputStream is = method.getResponseBodyAsStream();
			InputStreamReader isr = new InputStreamReader(is, charsetName == null ? DEFAULT_CHARSET : charsetName);
			br = new BufferedReader(isr);
			StringBuffer sb = new StringBuffer();
			String l;
			while ((l = br.readLine()) != null) {
				sb.append(l);
				sb.append(RN);
			}
			result = sb.toString();

		} catch (HttpException e) {
			LOG.debug("Fatal protocol violation: [" + uri + "]", e);
		} catch (IOException e) {
			LOG.debug("Fatal transport error: [" + uri + "]", e);
		} catch (IllegalArgumentException e) {
			LOG.debug("Illegal argument error: [" + uri + "]", e);
		} catch (IllegalStateException e) {
			LOG.debug("Illegal state error: [" + uri + "]", e);
		} finally {
			// Release the connection.
			if (method != null) {
				method.releaseConnection();
			}
			if (br != null) {
				try {
					br.close();
				} catch (IOException ignore) {
				}
			}
		}
		return result;
	}
	
	
	public static String post(String uri, RequestEntity requestEntity, Map<String,String> headerMap, String charsetName) {
		String result = null;
		BufferedReader br = null;
		// Create an instance of HttpClient.
		HttpClient client = new HttpClient();
		PostMethod method = null;

		try {
			// Create a method instance.
			method = new PostMethod(uri);
			
			// 添加 headers
			if(headerMap != null && headerMap.size() > 0) {
				Set<Entry<String, String>> entrySet = headerMap.entrySet();
				for (Entry<String, String> entry : entrySet) {
					method.addRequestHeader(entry.getKey(), entry.getValue());
				}
			}
			
			// Provide custom retry handler is necessary
			method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
					new DefaultHttpMethodRetryHandler(RETRY_COUNT, REQUEST_SENT_RETRY_ENABLED));
			
			method.setRequestEntity(requestEntity);
			// Execute the method.
			int statusCode = client.executeMethod(method);

			if (statusCode != HttpStatus.SC_OK) {
				LOG.debug("Method failed: " + method.getStatusLine());
			}

			// Read the response body.
			InputStream is = method.getResponseBodyAsStream();
			InputStreamReader isr = new InputStreamReader(is, charsetName == null ? DEFAULT_CHARSET : charsetName);
			br = new BufferedReader(isr);
			StringBuffer sb = new StringBuffer();
			String l;
			while ((l = br.readLine()) != null) {
				sb.append(l);
				sb.append(RN);
			}
			result = sb.toString();

		} catch (HttpException e) {
			LOG.debug("Fatal protocol violation: [" + uri + "]", e);
		} catch (IOException e) {
			LOG.debug("Fatal transport error: [" + uri + "]", e);
		} catch (IllegalArgumentException e) {
			LOG.debug("Illegal argument error: [" + uri + "]", e);
		} catch (IllegalStateException e) {
			LOG.debug("Illegal state error: [" + uri + "]", e);
		} finally {
			// Release the connection.
			if (method != null) {
				method.releaseConnection();
			}
			if (br != null) {
				try {
					br.close();
				} catch (IOException ignore) {
				}
			}
		}
		return result;
	}

	/**
	 * HTTP post method ,contentType is application/json ,default charset of
	 * response body is UTF-8
	 * 
	 * @param uri
	 *            either an absolute or relative URI
	 * @param jsonContent
	 *            request content which is json string with UTF-8 encoding
	 * @return null or response string
	 * @author Wi
	 */
	public static String json(String uri, String jsonContent) {
		return HttpUtils.json(uri, jsonContent, null);
	}

	/**
	 * HTTP post method ,contentType is application/json
	 * 
	 * @param uri
	 *            either an absolute or relative URI
	 * @param jsonContent
	 *            request content which is json string with UTF-8 encoding
	 * @param charsetName
	 *            the charset of response content
	 * @return null or response string
	 * @author Wi
	 */
	public static String json(String uri, String jsonContent, String charsetName) {
		String result = null;
		BufferedReader br = null;
		// Create an instance of HttpClient.
		HttpClient client = new HttpClient();
		PostMethod method = null;

		try {
			// Create a method instance.
			method = new PostMethod(uri);

			// Provide custom retry handler is necessary
			method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
					new DefaultHttpMethodRetryHandler(RETRY_COUNT, REQUEST_SENT_RETRY_ENABLED));

			StringRequestEntity sre = new StringRequestEntity(jsonContent, MIME_JSON, DEFAULT_CHARSET);
			method.setRequestEntity(sre);

			// Execute the method.
			int statusCode = client.executeMethod(method);

			if (statusCode != HttpStatus.SC_OK) {
				LOG.debug("Method failed: " + method.getStatusLine());
			}

			// Read the response body.
			InputStream is = method.getResponseBodyAsStream();
			InputStreamReader isr = new InputStreamReader(is, charsetName == null ? DEFAULT_CHARSET : charsetName);
			br = new BufferedReader(isr);
			StringBuffer sb = new StringBuffer();
			String l;
			while ((l = br.readLine()) != null) {
				sb.append(l);
				sb.append(RN);
			}
			result = sb.toString();

		} catch (HttpException e) {
			LOG.debug("Fatal protocol violation: [" + uri + "]", e);
		} catch (IOException e) {
			LOG.debug("Fatal transport error: [" + uri + "]", e);
		} catch (IllegalArgumentException e) {
			LOG.debug("Illegal argument error: [" + uri + "]", e);
		} catch (IllegalStateException e) {
			LOG.debug("Illegal state error: [" + uri + "]", e);
		} finally {
			// Release the connection.
			if (method != null) {
				method.releaseConnection();
			}
			if (br != null) {
				try {
					br.close();
				} catch (IOException ignore) {
				}
			}
		}
		return result;
	}
	
	public static void image(String uri ,String filePath){
		FileOutputStream fos = null;
		InputStream is = null;
		File imageFile = new File(filePath);
		// Create an instance of HttpClient.
		HttpClient client = new HttpClient();
		GetMethod method = null;
		try {
			// Create a method instance.
			method = new GetMethod(uri);

			// Provide custom retry handler is necessary
			method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
					new DefaultHttpMethodRetryHandler(RETRY_COUNT, REQUEST_SENT_RETRY_ENABLED));

			// Execute the method.
			int statusCode = client.executeMethod(method);

			if (statusCode != HttpStatus.SC_OK) {
				LOG.debug("Method failed: " + method.getStatusLine());
			}

			// Read the response body.
			fos = new FileOutputStream(imageFile);
			is = method.getResponseBodyAsStream();
			byte[] b = new byte[1024];
			int l;
			while((l = is.read(b)) != -1){
				fos.write(b, 0, l);
			}
			
		} catch (HttpException e) {
			LOG.debug("Fatal protocol violation: [" + uri + "]", e);
		} catch (IOException e) {
			LOG.debug("Fatal transport error: [" + uri + "]", e);
		} catch (IllegalArgumentException e) {
			LOG.debug("Illegal argument error: [" + uri + "]", e);
		} catch (IllegalStateException e) {
			LOG.debug("Illegal state error: [" + uri + "]", e);
		} finally {
			// Release the connection.
			if (method != null) {
				method.releaseConnection();
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException ignore) {
				}
			}
			if (is != null) {
				try {
					is.close();
				} catch (IOException ignore) {
				}
			}
		}
	}
	
	

}
