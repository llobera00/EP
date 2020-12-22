package medicalconsultation;

import medicalconsultation.FqUnit;
import medicalconsultation.Posology;

public class TakingGuideline{  // Represents the taking guidelines of a medicine

     private float dayMoment;
     private float duration;
     private String instructions;
     private Posology posology;

    public TakingGuideline(float dM, float du, String i, float d, float f, FqUnit u) {
            this.dayMoment=dM;
            this.duration=du;
            this.instructions=i;
            //...
        }  //  Initializes attributes


            // ???   // the gettersandsetters
}