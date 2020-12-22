package services; //Package for involved services
import medicalconsultation.MedicalPrescription;
import data.HealthCardID;
import java.net.ConnectException;
 /**
* External service for managingand storing ePrescriptions from population
*/
 public interface HealthNationalService {
    MedicalPrescription  getePrescription(HealthCardID hcID) throws HealthCardException, NotValidePrescriptionException, ConnectException;
    List<ProductSpecification>getProductsByKW(String keyWord) throws AnyKeyWordMedicineException, ConnectException;
    ProductSpecification getProductSpecific(int opt) throws AnyMedicineSearchException, ConnectException;
    MedicalPrescription sendePrescription(MedicalPrescription ePresc) throws ConnectException, NotValidePrescription, eSignatureException, NotCompletedMedicalPrescription;
}