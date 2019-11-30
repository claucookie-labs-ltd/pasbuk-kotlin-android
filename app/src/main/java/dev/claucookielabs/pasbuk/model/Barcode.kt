package dev.claucookielabs.pasbuk.model

/**
 * This class represents the information about the barcode
 *
 * @property format Barcode format. Must be one of the following values:
 * PKBarcodeFormatQR, PKBarcodeFormatPDF417, PKBarcodeFormatAztec.
 * @property message Message or payload to be displayed as a barcode.
 * @property messageEncoding The name of a supported
 * <a href="../lang/package-summary.html#charenc">character encoding</a>.
 * @property altText If known, text displayed near the barcode. For example,
 * a human-readable version of the barcode data in case the barcode doesn’t scan.
 */
data class Barcode(
    private var format: String,
    private var message: String,
    private var messageEncoding: String,
    private var altText: String? = ""
)