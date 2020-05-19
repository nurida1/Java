package Practise.practise;

public class get_set {

    public String name;
    public char gender;
    public int numChildren;
    public double weight;

    private long ID;
    private String husbandName;
    private long accountNumber;
    private long SSN;
    private double availableAmount;

    //public
    public get_set (String name) {
        this.name = name;
    }

    public get_set (char gender) {
        this.gender = gender;
    }

    public get_set ( int numChildren) {
        this.numChildren = numChildren;
    }

    public get_set (double weight) {
        this.weight = weight;
    }

    //private:
    public long getID () {
        return ID;
    }

    public void setID( long ID ) {
        this.ID = ID;
    }


    public String getHusbandName ( ) {
        return husbandName;
    }

    public void setHusbandName ( String husbandName ) {
        this.husbandName = husbandName;
    }

    public long getAccountNumber () {
        return accountNumber;
    }

    public void setAccountNumber (long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getSSN () {
        return SSN;
    }

    public void setSSN (long SSN) {
        this.SSN = SSN;
    }

    public double getAvailableAmount () {
        return  availableAmount;
    }

    public void setAvailableAmount (double availableAmount) {
        this.availableAmount = availableAmount;
    }



















}
