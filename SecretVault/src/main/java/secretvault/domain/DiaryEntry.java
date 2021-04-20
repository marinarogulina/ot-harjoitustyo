
package secretvault.domain;


public class DiaryEntry {
    private String title;
    private String text;
    
    public DiaryEntry() {
        this.title = "";
        this.text = "";
    }
    
    public DiaryEntry(String title) {
        this.title = title;
        this.text = "";
    }
    
    public void write(String text) {
        this.text += text;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return this.title;
    }
}
