package knab.core;

import javax.swing.text.AbstractDocument;

/**
 * @author knab (knab@telecolumbus.net)
 * @since 14-Aug-2010 23:42:05
 */
public class BIC {

    private String bankCode;
    private String countryCode;
    private String locality;
    private String branchCode;

    public BIC(final String bic) throws InvalidBICException {
        checkBIC(bic);
        extractBankCode(bic);
        extractCountryCode(bic);
        extractLocality(bic);
        extractBranchCode(bic);
    }

    private void checkBIC(String bic) throws InvalidBICException {
        if (isNull(bic) || isInvalidLength(bic)) {
            throw new InvalidBICException(bic);
        }
    }

    private boolean isNull(final String bic) {
        return null==bic;
    }

    private boolean isInvalidLength(final String bic) {
        int length = bic.length();
        return 8 != length && 11 != length;
    }

    private void extractBankCode(final String bic) {
        bankCode = bic.substring(0, 4);
    }

    private void extractCountryCode(final String bic) {
        countryCode = bic.substring(4,6);
    }

    private void extractLocality(final String bic) {
        locality = bic.substring(6,8);
    }

    private void extractBranchCode(final String bic) {
        if (11 == bic.length()) {
            branchCode = bic.substring(8,11);
        } else {
            branchCode = "XXX";
        }
    }

    public String getBankCode() {
        return bankCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getLocality() {
        return locality;
    }

    public String getBranchCode() {
        return branchCode;
    }

    @Override
    public String toString() {
        return bankCode + countryCode + locality + branchCode;
    }
}
