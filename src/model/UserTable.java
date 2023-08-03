package model;

public class UserTable {
    private String title;
    private String idColumn;
    private String nameColumn;
    private String cpfColumn;
    private String emailColumn;
    private String numberColumn;
    
    public UserTable() {
        this.title = "UserTable";
        this.idColumn = "Id_User";
        this.nameColumn = "Name_User";
        this.cpfColumn = "CPF";
        this.emailColumn = "Email_User";
        this.numberColumn = "Number_User";
    }
    public String getTitle() {
        return title;
    }
    public String getIdColumn() {
        return idColumn;
    }
    public String getCpfColumn() {
        return cpfColumn;
    }
    public String getEmailColumn() {
        return emailColumn;
    }
    public String getNameColumn() {
        return nameColumn;
    }
    public String getNumberColumn() {
        return numberColumn;
    }
}