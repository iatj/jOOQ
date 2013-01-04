/**
 * This class is generated by jOOQ
 */
package org.jooq.util.cubrid.dba.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class DbUser extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -453113149;

	/**
	 * The singleton instance of <code>db_user</code>
	 */
	public static final org.jooq.util.cubrid.dba.tables.DbUser DB_USER = new org.jooq.util.cubrid.dba.tables.DbUser();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>db_user.name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(1073741823), this);

	/**
	 * The column <code>db_user.id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>db_user.password</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Object> PASSWORD = createField("password", org.jooq.impl.SQLDataType.OTHER, this);

	/**
	 * The column <code>db_user.direct_groups</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Object> DIRECT_GROUPS = createField("direct_groups", org.jooq.impl.SQLDataType.OTHER, this);

	/**
	 * The column <code>db_user.groups</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Object> GROUPS = createField("groups", org.jooq.impl.SQLDataType.OTHER, this);

	/**
	 * The column <code>db_user.authorization</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Object> AUTHORIZATION = createField("authorization", org.jooq.impl.SQLDataType.OTHER, this);

	/**
	 * The column <code>db_user.triggers</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Object> TRIGGERS = createField("triggers", org.jooq.impl.SQLDataType.OTHER, this);

	/**
	 * Create a <code>db_user</code> table reference
	 */
	public DbUser() {
		super("db_user", org.jooq.util.cubrid.dba.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>db_user</code> table reference
	 */
	public DbUser(java.lang.String alias) {
		super(alias, org.jooq.util.cubrid.dba.DefaultSchema.DEFAULT_SCHEMA, org.jooq.util.cubrid.dba.tables.DbUser.DB_USER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.cubrid.dba.tables.DbUser as(java.lang.String alias) {
		return new org.jooq.util.cubrid.dba.tables.DbUser(alias);
	}
}
