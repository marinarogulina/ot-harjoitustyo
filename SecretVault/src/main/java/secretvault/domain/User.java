
package secretvault.domain;

import java.util.*;


public class User {
    final ArrayList<DiaryEntry> diaryEntries;
    private String passcode;
    
    public User() {
        this.diaryEntries = new ArrayList<>();
        this.passcode = "";
    }
    
    public String getPasscode() {
        return this.passcode;
    }
    
    public void setPasscode(String code) {
        this.passcode = code;
    }
    
    public ArrayList<DiaryEntry> getEntries() {
        return this.diaryEntries;
    }
    
    public void writeNewEntry() {
        DiaryEntry entry = new DiaryEntry();
        diaryEntries.add(entry);
        //TODO
    }
    
}
