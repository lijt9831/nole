package com.jxyd.nole.jpa.mybatis.plugin.sh;



import java.sql.SQLException;

/**
 * MysqlSqlFormatter formats Mysql specific types. These include Calendar,
 * Date, Time, and TimeStamps. Generic types are handled by SqlFormatter.
 */
public class MysqlSqlFormatter extends SqlFormatter {


	private String format(java.util.Calendar cal) {
		return "from_unixtime(" + cal.getTime().getTime()/1000 + ",'%Y-%m-%d %H:%i:%S')";
	}

	private String format(java.util.Date date) {
		return "from_unixtime(" + date.getTime()/1000  + ",'%Y-%m-%d %H:%i:%S')";
	}

	private String format(java.sql.Date date) {
		return "from_unixtime(" + date.getTime()/1000 + ",'%Y-%m-%d %H:%i:%S')";
	}

	private String format(java.sql.Timestamp timestamp) {
		return "from_unixtime(" + timestamp.getTime()/1000 + ",'%Y-%m-%d %H:%i:%S')";
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