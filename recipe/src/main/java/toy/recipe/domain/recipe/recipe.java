package toy.recipe.domain.recipe;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class recipe {
    @Id
    @Column(name="RCP_SEQ")
    private String rcpSeq;

    @Column(name="RCP_NM")
    private String rcpName;

    @Column(name="RCP_WAY2")
    private String rcpWay;

    @Column(name="RCP_PAT2")
    private String rcpPat;

    @Column(name="INFO_WGT")
    private String infoWgt;

    @Column(name="INFO_ENG")
    private Float infoEng;

    @Column(name="INFO_CAR")
    private String infoCar;

    @Column(name="INFO_PRO")
    private String infoPro;

    @Column(name="INFO_FAT")
    private String infoFat;

    @Column(name="INFO_NA")
    private String infoNa;

    @Column(name="HASH_TAG")
    private String hashTag;

    @Column(name="ATT_FILE_NO_MAIN")
    private String attFileNoMain;

    @Column(name="ATT_FILE_NO_MK")
    private String attFileNoMk;

    @Column(name="RCP_PARTS_DTLS")
    private String rcpPartsDtls;

    @Column(name="MANUAL01")
    private String manual01;

    @Column(name="MANUAL_IMG01")
    private String manualImg01;

    @Column(name="MANUAL02")
    private String manual02;

    @Column(name="MANUAL_IMG02")
    private String manualImg02;

    @Column(name="MANUAL03")
    private String manual03;

    @Column(name="MANUAL_IMG03")
    private String manualImg03;

    @Column(name="MANUAL04")
    private String manual04;

    @Column(name="MANUAL_IMG04")
    private String manualImg04;

    @Column(name="MANUAL05")
    private String manual05;

    @Column(name="MANUAL_IMG05")
    private String manualImg05;

    @Column(name="MANUAL06")
    private String manual06;

    @Column(name="MANUAL_IMG06")
    private String manualImg06;

    @Column(name="MANUAL07")
    private String manual07;

    @Column(name="MANUAL_IMG07")
    private String manualImg07;

    @Column(name="MANUAL08")
    private String manual08;

    @Column(name="MANUAL_IMG08")
    private String manualImg08;

    @Column(name="MANUAL09")
    private String manual09;

    @Column(name="MANUAL_IMG09")
    private String manualImg09;

    @Column(name="MANUAL10")
    private String manual10;

    @Column(name="MANUAL_IMG10")
    private String manualImg10;

    @Column(name="MANUAL11")
    private String manual11;

    @Column(name="MANUAL_IMG11")
    private String manualImg11;

    @Column(name="MANUAL12")
    private String manual12;

    @Column(name="MANUAL_IMG12")
    private String manualImg12;

    @Column(name="MANUAL13")
    private String manual13;

    @Column(name="MANUAL_IMG13")
    private String manualImg13;

    @Column(name="MANUAL14")
    private String manual14;

    @Column(name="MANUAL_IMG14")
    private String manualImg14;

    @Column(name="MANUAL15")
    private String manual15;

    @Column(name="MANUAL_IMG15")
    private String manualImg15;

    @Column(name="MANUAL16")
    private String manual16;

    @Column(name="MANUAL_IMG16")
    private String manualImg16;

    @Column(name="MANUAL17")
    private String manual17;

    @Column(name="MANUAL_IMG17")
    private String manualImg17;

    @Column(name="MANUAL18")
    private String manual18;

    @Column(name="MANUAL_IMG18")
    private String manualImg18;

    @Column(name="MANUAL19")
    private String manual19;

    @Column(name="MANUAL_IMG19")
    private String manualImg19;

    @Column(name="MANUAL20")
    private String manual20;

    @Column(name="MANUAL_IMG20")
    private String manualImg20;

    public String getRcpSeq() {
        return rcpSeq;
    }

    public String getRcpName() {
        return rcpName;
    }

    public String getRcpWay() {
        return rcpWay;
    }

    public String getRcpPat() {
        return rcpPat;
    }

    public String getInfoWgt() {
        return infoWgt;
    }

    public Float getInfoEng() {
        return infoEng;
    }

    public String getInfoCar() {
        return infoCar;
    }

    public String getInfoPro() {
        return infoPro;
    }

    public String getInfoFat() {
        return infoFat;
    }

    public String getInfoNa() {
        return infoNa;
    }

    public String getHashTag() {
        return hashTag;
    }

    public String getAttFileNoMain() {
        return attFileNoMain;
    }

    public String getAttFileNoMk() {
        return attFileNoMk;
    }

    public String getRcpPartsDtls() {
        return rcpPartsDtls;
    }

    public String getManual01() {
        return manual01;
    }

    public String getManualImg01() {
        return manualImg01;
    }

    public String getManual02() {
        return manual02;
    }

    public String getManualImg02() {
        return manualImg02;
    }

    public String getManual03() {
        return manual03;
    }

    public String getManualImg03() {
        return manualImg03;
    }

    public String getManual04() {
        return manual04;
    }

    public String getManualImg04() {
        return manualImg04;
    }

    public String getManual05() {
        return manual05;
    }

    public String getManualImg05() {
        return manualImg05;
    }

    public String getManual06() {
        return manual06;
    }

    public String getManualImg06() {
        return manualImg06;
    }

    public String getManual07() {
        return manual07;
    }

    public String getManualImg07() {
        return manualImg07;
    }

    public String getManual08() {
        return manual08;
    }

    public String getManualImg08() {
        return manualImg08;
    }

    public String getManual09() {
        return manual09;
    }

    public String getManualImg09() {
        return manualImg09;
    }

    public String getManual10() {
        return manual10;
    }

    public String getManualImg10() {
        return manualImg10;
    }

    public String getManual11() {
        return manual11;
    }

    public String getManualImg11() {
        return manualImg11;
    }

    public String getManual12() {
        return manual12;
    }

    public String getManualImg12() {
        return manualImg12;
    }

    public String getManual13() {
        return manual13;
    }

    public String getManualImg13() {
        return manualImg13;
    }

    public String getManual14() {
        return manual14;
    }

    public String getManualImg14() {
        return manualImg14;
    }

    public String getManual15() {
        return manual15;
    }

    public String getManualImg15() {
        return manualImg15;
    }

    public String getManual16() {
        return manual16;
    }

    public String getManualImg16() {
        return manualImg16;
    }

    public String getManual17() {
        return manual17;
    }

    public String getManualImg17() {
        return manualImg17;
    }

    public String getManual18() {
        return manual18;
    }

    public String getManualImg18() {
        return manualImg18;
    }

    public String getManual19() {
        return manual19;
    }

    public String getManualImg19() {
        return manualImg19;
    }

    public String getManual20() {
        return manual20;
    }

    public String getManualImg20() {
        return manualImg20;
    }

    public recipe(String rcpSeq, String rcpName, String rcpWay, String rcpPat, String infoWgt, Float infoEng, String infoCar, String infoPro, String infoFat, String infoNa, String hashTag, String attFileNoMain, String attFileNoMk, String rcpPartsDtls, String manual01, String manualImg01, String manual02, String manualImg02, String manual03, String manualImg03, String manual04, String manualImg04, String manual05, String manualImg05, String manual06, String manualImg06, String manual07, String manualImg07, String manual08, String manualImg08, String manual09, String manualImg09, String manual10, String manualImg10, String manual11, String manualImg11, String manual12, String manualImg12, String manual13, String manualImg13, String manual14, String manualImg14, String manual15, String manualImg15, String manual16, String manualImg16, String manual17, String manualImg17, String manual18, String manualImg18, String manual19, String manualImg19, String manual20, String manualImg20) {
        this.rcpSeq = rcpSeq;
        this.rcpName = rcpName;
        this.rcpWay = rcpWay;
        this.rcpPat = rcpPat;
        this.infoWgt = infoWgt;
        this.infoEng = infoEng;
        this.infoCar = infoCar;
        this.infoPro = infoPro;
        this.infoFat = infoFat;
        this.infoNa = infoNa;
        this.hashTag = hashTag;
        this.attFileNoMain = attFileNoMain;
        this.attFileNoMk = attFileNoMk;
        this.rcpPartsDtls = rcpPartsDtls;
        this.manual01 = manual01;
        this.manualImg01 = manualImg01;
        this.manual02 = manual02;
        this.manualImg02 = manualImg02;
        this.manual03 = manual03;
        this.manualImg03 = manualImg03;
        this.manual04 = manual04;
        this.manualImg04 = manualImg04;
        this.manual05 = manual05;
        this.manualImg05 = manualImg05;
        this.manual06 = manual06;
        this.manualImg06 = manualImg06;
        this.manual07 = manual07;
        this.manualImg07 = manualImg07;
        this.manual08 = manual08;
        this.manualImg08 = manualImg08;
        this.manual09 = manual09;
        this.manualImg09 = manualImg09;
        this.manual10 = manual10;
        this.manualImg10 = manualImg10;
        this.manual11 = manual11;
        this.manualImg11 = manualImg11;
        this.manual12 = manual12;
        this.manualImg12 = manualImg12;
        this.manual13 = manual13;
        this.manualImg13 = manualImg13;
        this.manual14 = manual14;
        this.manualImg14 = manualImg14;
        this.manual15 = manual15;
        this.manualImg15 = manualImg15;
        this.manual16 = manual16;
        this.manualImg16 = manualImg16;
        this.manual17 = manual17;
        this.manualImg17 = manualImg17;
        this.manual18 = manual18;
        this.manualImg18 = manualImg18;
        this.manual19 = manual19;
        this.manualImg19 = manualImg19;
        this.manual20 = manual20;
        this.manualImg20 = manualImg20;
    }
}
