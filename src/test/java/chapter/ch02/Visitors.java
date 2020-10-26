package chapter.ch02;

import com.opencsv.bean.CsvBindByName;

/**
 * Visitors
 * todo
 *
 * @author kujin
 * 创建时间：2020/10/25
 * @version 1
 */
public class Visitors {
    @CsvBindByName
    private String firstName;

    @CsvBindByName
    private String lastName;

    @CsvBindByName
    private int visitsToWebsite;

    // Getters and setters go here.

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getVisitsToWebsite() {
        return visitsToWebsite;
    }

    public void setVisitsToWebsite(int visitsToWebsite) {
        this.visitsToWebsite = visitsToWebsite;
    }
}
