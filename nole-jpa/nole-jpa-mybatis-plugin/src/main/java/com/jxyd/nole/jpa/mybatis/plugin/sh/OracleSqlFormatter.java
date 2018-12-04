package com.jxyd.nole.jpa.mybatis.plugin.sh;



import java.sql.SQLException;

/**
 * OracleSqlFormatter formats Oracle specific types. These include Calendar,
 * Date, Time, and TimeStamps. Generic types are handled by SqlFormatter.
 */
public class OracleSqlFormatter extends SqlFormatter {

	/**
	 * Format of Oracle timestamp: 'YYYY-MM-DD HH24:MI:SS.FF9'
	 */
	private static final String ymd24_timestamp = "'YYYY-MM-DD HH24:MI:SS.FF9'";

	private String format(java.util.Calendar cal) {
		return "TO_TIMESTAMP('" + new java.sql.Timestamp(cal.getTime().getTime()) + "'," + ymd24_timestamp + ")";
	}

	private String format(java.util.Date date) {
		return "TO_TIMESTAMP('" + new java.sql.Timestamp(date.getTime()) + "'," + ymd24_timestamp + ")";
	}

	private String format(java.sql.Date date) {
		return "TO_TIMESTAMP('" + new java.sql.Timestamp(date.getTime()) + "'," + ymd24_timestamp + ")";
	}

	private String format(java.sql.Timestamp timestamp) {
		return "TO_TIMESTAMP('" + timestamp.toString() + "'," + ymd24_timestamp + ")";
	}

	/**
	 * Formats object to an Oracle specific formatted function.
	 * 
	 * @param o
	 *            Object to be formatted.
	 * @return formatted Oracle function or "NULL" if o is null.
	 * @exception SqlException
	 */
	public String format(Object o) throws SQLException {
		if (o == null) return "NULL";
		if (o instanceof java.util.Calendar) return format((java.util.Calendar) o);
		if (o instanceof java.util.Date) return format((java.util.Date) o);
		if (o instanceof java.sql.Date) return format((java.sql.Date) o);
		if (o instanceof java.sql.Time) return format((java.sql.Time) o);
		if (o instanceof java.sql.Timestamp) return format((java.sql.Timestamp) o);
		// if object not in one of our overridden methods, send to super class
		return super.format(o);

	}
}