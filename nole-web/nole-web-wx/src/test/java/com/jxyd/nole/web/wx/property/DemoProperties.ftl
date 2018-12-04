package ${pack};

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

/** 
 * 说明：${filename}
 * 创建人：zxg
 * 创建时间：${date?string("yyyy")}
 */
@Component
public class ${filename?cap_first} {

	<#list properties as property>
${property.comment}
	public static ${property.type} ${property.keyCons};
	
	</#list>
	<#list properties as property>
    @Autowired
    public void set${property.keyCons?cap_first}(@Value("${sharp}{${ref}['${property.key}']}") ${property.type} ${property.keyCons}) {
    	${filename?cap_first}.${property.keyCons} = ${property.keyCons};
    }
    
    </#list>
    
    @Bean("${ref}")
	public Properties getProperties() {
		Properties properties = new Properties();
		try {
			properties.load(new ClassPathResource("${res}").getInputStream());
		} catch (IOException e) {
			throw new RuntimeException("读取属性文件", e);
		}
		return properties;
	}
}
