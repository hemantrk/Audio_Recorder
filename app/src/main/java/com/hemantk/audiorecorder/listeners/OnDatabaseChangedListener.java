package com.hemantk.audiorecorder.listeners;

/**
 * Created by Hemant on 01/01/2017.
 * Listen for add/rename items in database
 */
public interface OnDatabaseChangedListener{
    void onNewDatabaseEntryAdded();
    void onDatabaseEntryRenamed();
}