package medicalconsultation;

import data.*;
import java.util.Date;
import medicalconsultation.exceptions.*;
public class MedicalPrescription { // A class that represents medical prescription
    private int prescCode;
    private Date prescDate;
    private Date endDate;
    private HealthCardID hcID; // the healthcard ID of the patient
    private DigitalSignature eSign; // the eSignature of the doctor
    //??? // Its components, that is, the set of medical prescription lines
    public MedicalPrescription () {. . . } // Makes some inicialization
    public void addLine(ProductID prodID, String[] instruc){. . . } throws  IncorrectTakingGuidelinesException;
    public void modifyLine(ProductID prodID,String[] instruc){ . . . } throws ProductNotInPrescription, IncorrectTakingGuidelinesException;
    public void removeLine(ProductID prodID){ . . . } throws ProductNotInPrescription;

    ???// the gettersandsetters

}