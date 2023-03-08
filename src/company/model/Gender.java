package company.model;

public enum Gender {
    MALE("male"),
    FAMALE("famale");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
