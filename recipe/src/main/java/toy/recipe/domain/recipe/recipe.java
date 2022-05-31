package toy.recipe.domain.recipe;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class recipe {
    @Id
    private String RCP_SEQ;
    private String RCP_NM;
    private String RCP_WAY2;
    private String RCP_PAT2;
    private String INFO_WGT;
    private Float INFO_ENG;
    private String INFO_CAR;
    private String INFO_PRO;
    private String INFO_FAT;
    private String INFO_NA;
    private String HASH_TAG;
    private String ATT_FILE_NO_MAIN;
    private String ATT_FILE_NO_MK;
    private String RCP_PARTS_DTLS;
    private String MANUAL01;;
    private String MANUAL_IMG01;
    private String MANUAL02;
    private String MANUAL_IMG02;
    private String MANUAL03;
    private String MANUAL_IMG03;
    private String MANUAL04;
    private String MANUAL_IMG04;
    private String MANUAL05;
    private String MANUAL_IMG05;
    private String MANUAL06;
    private String MANUAL_IMG06;
    private String MANUAL07;
    private String MANUAL_IMG07;
    private String MANUAL08;
    private String MANUAL_IMG08;
    private String MANUAL09;
    private String MANUAL_IMG09;
    private String MANUAL10;
    private String MANUAL_IMG10;
    private String MANUAL11;
    private String MANUAL_IMG11;
    private String MANUAL12;
    private String MANUAL_IMG12;
    private String MANUAL13;
    private String MANUAL_IMG13;
    private String MANUAL14;
    private String MANUAL_IMG14;
    private String MANUAL15;
    private String MANUAL_IMG15;
    private String MANUAL16;
    private String MANUAL_IMG16;
    private String MANUAL17;
    private String MANUAL_IMG17;
    private String MANUAL18;
    private String MANUAL_IMG18;
    private String MANUAL19;
    private String MANUAL_IMG19;
    private String MANUAL20;
    private String MANUAL_IMG20;


    public String getRCP_SEQ() {
        return RCP_SEQ;
    }

    public String getRCP_NM() {
        return RCP_NM;
    }

    public String getRCP_WAY2() {
        return RCP_WAY2;
    }

    public String getRCP_PAT2() {
        return RCP_PAT2;
    }

    public String getINFO_WGT() {
        return INFO_WGT;
    }

    public Float getINFO_ENG() {
        return INFO_ENG;
    }

    public String getINFO_CAR() {
        return INFO_CAR;
    }

    public String getINFO_PRO() {
        return INFO_PRO;
    }

    public String getINFO_FAT() {
        return INFO_FAT;
    }

    public String getINFO_NA() {
        return INFO_NA;
    }

    public String getHASH_TAG() {
        return HASH_TAG;
    }

    public String getATT_FILE_NO_MAIN() {
        return ATT_FILE_NO_MAIN;
    }

    public String getATT_FILE_NO_MK() {
        return ATT_FILE_NO_MK;
    }

    public String getRCP_PARTS_DTLS() {
        return RCP_PARTS_DTLS;
    }

    public String getMANUAL01() {
        return MANUAL01;
    }

    public String getMANUAL_IMG01() {
        return MANUAL_IMG01;
    }

    public String getMANUAL02() {
        return MANUAL02;
    }

    public String getMANUAL_IMG02() {
        return MANUAL_IMG02;
    }

    public String getMANUAL03() {
        return MANUAL03;
    }

    public String getMANUAL_IMG03() {
        return MANUAL_IMG03;
    }

    public String getMANUAL04() {
        return MANUAL04;
    }

    public String getMANUAL_IMG04() {
        return MANUAL_IMG04;
    }

    public String getMANUAL05() {
        return MANUAL05;
    }

    public String getMANUAL_IMG05() {
        return MANUAL_IMG05;
    }

    public String getMANUAL06() {
        return MANUAL06;
    }

    public String getMANUAL_IMG06() {
        return MANUAL_IMG06;
    }

    public String getMANUAL07() {
        return MANUAL07;
    }

    public String getMANUAL_IMG07() {
        return MANUAL_IMG07;
    }

    public String getMANUAL08() {
        return MANUAL08;
    }

    public String getMANUAL_IMG08() {
        return MANUAL_IMG08;
    }

    public String getMANUAL09() {
        return MANUAL09;
    }

    public String getMANUAL_IMG09() {
        return MANUAL_IMG09;
    }

    public String getMANUAL10() {
        return MANUAL10;
    }

    public String getMANUAL_IMG10() {
        return MANUAL_IMG10;
    }

    public String getMANUAL11() {
        return MANUAL11;
    }

    public String getMANUAL_IMG11() {
        return MANUAL_IMG11;
    }

    public String getMANUAL12() {
        return MANUAL12;
    }

    public String getMANUAL_IMG12() {
        return MANUAL_IMG12;
    }

    public String getMANUAL13() {
        return MANUAL13;
    }

    public String getMANUAL_IMG13() {
        return MANUAL_IMG13;
    }

    public String getMANUAL14() {
        return MANUAL14;
    }

    public String getMANUAL_IMG14() {
        return MANUAL_IMG14;
    }

    public String getMANUAL15() {
        return MANUAL15;
    }

    public String getMANUAL_IMG15() {
        return MANUAL_IMG15;
    }

    public String getMANUAL16() {
        return MANUAL16;
    }

    public String getMANUAL_IMG16() {
        return MANUAL_IMG16;
    }

    public String getMANUAL17() {
        return MANUAL17;
    }

    public String getMANUAL_IMG17() {
        return MANUAL_IMG17;
    }

    public String getMANUAL18() {
        return MANUAL18;
    }

    public String getMANUAL_IMG18() {
        return MANUAL_IMG18;
    }

    public String getMANUAL19() {
        return MANUAL19;
    }

    public String getMANUAL_IMG19() {
        return MANUAL_IMG19;
    }

    public String getMANUAL20() {
        return MANUAL20;
    }

    public String getMANUAL_IMG20() {
        return MANUAL_IMG20;
    }

    public recipe(String RCP_SEQ, String RCP_NM, String RCP_WAY2, String RCP_PAT2, String INFO_WGT, Float INFO_ENG, String INFO_CAR, String INFO_PRO, String INFO_FAT, String INFO_NA, String HASH_TAG, String ATT_FILE_NO_MAIN, String ATT_FILE_NO_MK, String RCP_PARTS_DTLS, String MANUAL01, String MANUAL_IMG01, String MANUAL02, String MANUAL_IMG02, String MANUAL03, String MANUAL_IMG03, String MANUAL04, String MANUAL_IMG04, String MANUAL05, String MANUAL_IMG05, String MANUAL06, String MANUAL_IMG06, String MANUAL07, String MANUAL_IMG07, String MANUAL08, String MANUAL_IMG08, String MANUAL09, String MANUAL_IMG09, String MANUAL10, String MANUAL_IMG10, String MANUAL11, String MANUAL_IMG11, String MANUAL12, String MANUAL_IMG12, String MANUAL13, String MANUAL_IMG13, String MANUAL14, String MANUAL_IMG14, String MANUAL15, String MANUAL_IMG15, String MANUAL16, String MANUAL_IMG16, String MANUAL17, String MANUAL_IMG17, String MANUAL18, String MANUAL_IMG18, String MANUAL19, String MANUAL_IMG19, String MANUAL20, String MANUAL_IMG20) {
        this.RCP_SEQ = RCP_SEQ;
        this.RCP_NM = RCP_NM;
        this.RCP_WAY2 = RCP_WAY2;
        this.RCP_PAT2 = RCP_PAT2;
        this.INFO_WGT = INFO_WGT;
        this.INFO_ENG = INFO_ENG;
        this.INFO_CAR = INFO_CAR;
        this.INFO_PRO = INFO_PRO;
        this.INFO_FAT = INFO_FAT;
        this.INFO_NA = INFO_NA;
        this.HASH_TAG = HASH_TAG;
        this.ATT_FILE_NO_MAIN = ATT_FILE_NO_MAIN;
        this.ATT_FILE_NO_MK = ATT_FILE_NO_MK;
        this.RCP_PARTS_DTLS = RCP_PARTS_DTLS;
        this.MANUAL01 = MANUAL01;
        this.MANUAL_IMG01 = MANUAL_IMG01;
        this.MANUAL02 = MANUAL02;
        this.MANUAL_IMG02 = MANUAL_IMG02;
        this.MANUAL03 = MANUAL03;
        this.MANUAL_IMG03 = MANUAL_IMG03;
        this.MANUAL04 = MANUAL04;
        this.MANUAL_IMG04 = MANUAL_IMG04;
        this.MANUAL05 = MANUAL05;
        this.MANUAL_IMG05 = MANUAL_IMG05;
        this.MANUAL06 = MANUAL06;
        this.MANUAL_IMG06 = MANUAL_IMG06;
        this.MANUAL07 = MANUAL07;
        this.MANUAL_IMG07 = MANUAL_IMG07;
        this.MANUAL08 = MANUAL08;
        this.MANUAL_IMG08 = MANUAL_IMG08;
        this.MANUAL09 = MANUAL09;
        this.MANUAL_IMG09 = MANUAL_IMG09;
        this.MANUAL10 = MANUAL10;
        this.MANUAL_IMG10 = MANUAL_IMG10;
        this.MANUAL11 = MANUAL11;
        this.MANUAL_IMG11 = MANUAL_IMG11;
        this.MANUAL12 = MANUAL12;
        this.MANUAL_IMG12 = MANUAL_IMG12;
        this.MANUAL13 = MANUAL13;
        this.MANUAL_IMG13 = MANUAL_IMG13;
        this.MANUAL14 = MANUAL14;
        this.MANUAL_IMG14 = MANUAL_IMG14;
        this.MANUAL15 = MANUAL15;
        this.MANUAL_IMG15 = MANUAL_IMG15;
        this.MANUAL16 = MANUAL16;
        this.MANUAL_IMG16 = MANUAL_IMG16;
        this.MANUAL17 = MANUAL17;
        this.MANUAL_IMG17 = MANUAL_IMG17;
        this.MANUAL18 = MANUAL18;
        this.MANUAL_IMG18 = MANUAL_IMG18;
        this.MANUAL19 = MANUAL19;
        this.MANUAL_IMG19 = MANUAL_IMG19;
        this.MANUAL20 = MANUAL20;
        this.MANUAL_IMG20 = MANUAL_IMG20;
    }
}
