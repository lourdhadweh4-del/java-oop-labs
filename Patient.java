package Patients;

public class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diseaseName;
    private double billAmount;

    public Patient (int age1, String diseaseName1) {
        this.age = age1;
        this.diseaseName = diseaseName1;
    }
    public Patient (int age1,String name,double billAmount){
        this.age=age1;
        this.name=name;
        this.billAmount=billAmount;
    }
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId1) {
        this.patientId = patientId1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name1) {
        this.name = name1;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age1) {
        this.age = age1;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName1) {
        this.diseaseName = diseaseName1;
        System.out.println(diseaseName);

    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount1) {
        this.billAmount = billAmount1;


    }
        public void updateBill(double amount){
            if (age > 0) {
                amount+=billAmount;
                System.out.println("Your Bill Amount is " + amount);

            } else {
                System.out.println("Invalid Amount ");


            }

        }
    }



