/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables.records;


import com.tej.JooQDemo.jooq.sample.model.tables.Status;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StatusRecord extends UpdatableRecordImpl<StatusRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>chubaka_site.status.id</code>.
     */
    public StatusRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>chubaka_site.status.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>chubaka_site.status.statusName</code>.
     */
    public StatusRecord setStatusname(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>chubaka_site.status.statusName</code>.
     */
    public String getStatusname() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Status.STATUS.ID;
    }

    @Override
    public Field<String> field2() {
        return Status.STATUS.STATUSNAME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getStatusname();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getStatusname();
    }

    @Override
    public StatusRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public StatusRecord value2(String value) {
        setStatusname(value);
        return this;
    }

    @Override
    public StatusRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StatusRecord
     */
    public StatusRecord() {
        super(Status.STATUS);
    }

    /**
     * Create a detached, initialised StatusRecord
     */
    public StatusRecord(Integer id, String statusname) {
        super(Status.STATUS);

        setId(id);
        setStatusname(statusname);
    }
}
