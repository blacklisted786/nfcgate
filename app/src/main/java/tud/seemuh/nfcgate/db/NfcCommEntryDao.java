package tud.seemuh.nfcgate.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

@Dao
public interface NfcCommEntryDao {
    @Insert
    void insert(NfcCommEntry log);
}
