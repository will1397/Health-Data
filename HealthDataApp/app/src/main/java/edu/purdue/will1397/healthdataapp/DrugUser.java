package edu.purdue.will1397.healthdataapp;

import java.util.*;
import static android.R.id.list;

/**
 * Created by Joseph on 1/28/2017.
 */

public class DrugUser {
    public final static String[] Medical_problems ={"Deep Vein Thrombosis",
            "History of Clots",
            "Coronary Artery Disease",
            "Hypertension",
            "Pulmonary Embolism",
            "Atrial Fibrillation",
            "Atrial Flutter	Genetic Spinal defect",
            "Stroke	Recent Spinal Surgery",
            "Hip Replacement	",
            "Knee Replacement"};

    public final static String[] Contraindications =
            {
                    "Artifical Heart Replacement",
                    "Hemorrhagic stroke",
                    "Uncontrolled Hypertension",
                    "Stomach Ulcer",
                    "Intestinal bleeding",
                    "Intestinal Ulcers",
                    "Genetic Spinal defects",
                    "Recent Spinal Surgery",
                    "Hip Replacement",
                    "History of Kidney Disease",
                    "History of Liver Disease",
                    "History of bleeding disorders" };

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public List getMedicalHistory() {
        return MedicalHistory;
    }

    private String name;
    private String dob;
    private List MedicalHistory;
    private int weight;


    public DrugUser(String name, int weight, List MedicalHistory,String dob) {
        this.name = name;
        this.dob = dob;
        this.MedicalHistory = MedicalHistory;
        this.weight = weight;
    }

    public void setMedicalHistory(List medicalHistory) {
        this.MedicalHistory = medicalHistory;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getweight() {
        return weight;
    }
    public void setweight(int weight) {
        this.weight = weight;
    }

}
