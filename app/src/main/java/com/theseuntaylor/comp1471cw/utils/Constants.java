package com.theseuntaylor.comp1471cw.utils;

public class Constants {
    public static final String DATABASE_NAME = "COMP1471";
    public static final int DATABASE_VERSION = 2;


    // TRAYS
    public static final String TABLE_TRAY_NAME = "Trays";
    public static final String COLUMN_TRAY_ID = "tray_id";
    public static final String COLUMN_TRAY_NAME = "tray_name";
    public static final String COLUMN_DATE_STERILISATION = "date_sterilisation";
    public static final String COLUMN_TIME_STERILISATION = "time_sterilisation";
    public static final String COLUMN_TRAY_STATUS = "tray_status";
    public static final String COLUMN_INSTRUMENT_TYPE = "instrument_type";

    public static String TRAY_CREATE = "create table "
            + TABLE_TRAY_NAME + " ("
            + COLUMN_TRAY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_TRAY_NAME + " TEXT, "
            + COLUMN_DATE_STERILISATION + " TEXT, "
            + COLUMN_TIME_STERILISATION + " TEXT, "
            + COLUMN_TRAY_STATUS + " TEXT, "
            + COLUMN_INSTRUMENT_TYPE + " TEXT)";

    // STERILISATION OFFICER
    public static final String STERILISATION_OFFICER = "sterilisation_officer";
    public static final String COLUMN_STERILISATION_OFFICER_ID = "sterilisation_officer_id";
    public static final String COLUMN_STERILISATION_OFFICER_NAME = "sterilisation_officer_name";

    public static final String STERILISATION_OFFICER_CREATE = "create table "
            + STERILISATION_OFFICER + " ("
            + COLUMN_STERILISATION_OFFICER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_STERILISATION_OFFICER_NAME + " TEXT)";

    // CLEANING PROCESS
    public static final String CLEANING_PROCESS_TABLE = "cleaning_process";
    public static final String COLUMN_CLEANING_PROCESS_ID = "cleaning_process_id";
    public static final String COLUMN_CLEANING_PROCESS_NAME = "cleaning_process_name";

    public static final String CLEANING_PROCESS_CREATE = "create table "
            + CLEANING_PROCESS_TABLE + " ("
            + COLUMN_CLEANING_PROCESS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_CLEANING_PROCESS_NAME + " TEXT)";

    // STEPS TABLE
    public static final String STEPS = "steps";
    public static final String COLUMN_STEPS_ID = "steps_id";
    public static final String COLUMN_STEPS_NAME = "steps_name";

    public static final String STEPS_CREATE = "create table "
            + STEPS + " ("
            + COLUMN_STEPS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_CLEANING_PROCESS_ID + " INTEGER, "
            + COLUMN_STEPS_NAME + " TEXT, "
            + " FOREIGN KEY (" + COLUMN_CLEANING_PROCESS_ID + ") REFERENCES " + CLEANING_PROCESS_TABLE + "(" + COLUMN_CLEANING_PROCESS_ID + "));";

    // ORDER TABLE
    public static final String ORDER = "order_table";
    public static final String ORDER_ID = "order_id";
    public static final String TRAY_TYPE_NAME = "tray_type_name";
    public static final String ORDER_NAME = "order_name";

    public static final String ORDER_CREATE = "create table "
            + ORDER + " ("
            + ORDER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + ORDER_NAME + " TEXT, "
            + COLUMN_CLEANING_PROCESS_ID + " INTEGER, "
            + TRAY_TYPE_NAME + " TEXT, "
            + " FOREIGN KEY (" + COLUMN_CLEANING_PROCESS_ID + ") REFERENCES " + CLEANING_PROCESS_TABLE + "(" + COLUMN_CLEANING_PROCESS_ID + "));";


}
