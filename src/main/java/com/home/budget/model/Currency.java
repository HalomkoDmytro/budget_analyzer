package com.home.budget.model;

/**
 * ISO 4217 Currency Codes Enum
 * Contains all active currencies as defined by the ISO 4217 standard.
 *
 * Each constant holds:
 *   - code         : the 3-letter alphabetic code (e.g. "USD")
 *   - numericCode  : the 3-digit numeric code (e.g. 840)
 *   - name         : the official English name
 *   - minorUnit    : number of decimal digits used (e.g. 2 for cents)
 */
public enum Currency {

    // ── A ──────────────────────────────────────────────────────────────────
    AED("AED", 784, "UAE Dirham", 2),
    AFN("AFN", 971, "Afghan Afghani", 2),
    ALL("ALL", 8,   "Albanian Lek", 2),
    AMD("AMD", 51,  "Armenian Dram", 2),
    ANG("ANG", 532, "Netherlands Antillean Guilder", 2),
    AOA("AOA", 973, "Angolan Kwanza", 2),
    ARS("ARS", 32,  "Argentine Peso", 2),
    AUD("AUD", 36,  "Australian Dollar", 2),
    AWG("AWG", 533, "Aruban Florin", 2),
    AZN("AZN", 944, "Azerbaijani Manat", 2),

    // ── B ──────────────────────────────────────────────────────────────────
    BAM("BAM", 977, "Bosnia and Herzegovina Convertible Mark", 2),
    BBD("BBD", 52,  "Barbados Dollar", 2),
    BDT("BDT", 50,  "Bangladeshi Taka", 2),
    BGN("BGN", 975, "Bulgarian Lev", 2),
    BHD("BHD", 48,  "Bahraini Dinar", 3),
    BIF("BIF", 108, "Burundian Franc", 0),
    BMD("BMD", 60,  "Bermudian Dollar", 2),
    BND("BND", 96,  "Brunei Dollar", 2),
    BOB("BOB", 68,  "Boliviano", 2),
    BOV("BOV", 984, "Bolivian Mvdol (funds code)", 2),
    BRL("BRL", 986, "Brazilian Real", 2),
    BSD("BSD", 44,  "Bahamian Dollar", 2),
    BTN("BTN", 64,  "Bhutanese Ngultrum", 2),
    BWP("BWP", 72,  "Botswana Pula", 2),
    BYN("BYN", 933, "Belarusian Ruble", 2),
    BZD("BZD", 84,  "Belize Dollar", 2),

    // ── C ──────────────────────────────────────────────────────────────────
    CAD("CAD", 124, "Canadian Dollar", 2),
    CDF("CDF", 976, "Congolese Franc", 2),
    CHE("CHE", 947, "WIR Euro (complementary currency)", 2),
    CHF("CHF", 756, "Swiss Franc", 2),
    CHW("CHW", 948, "WIR Franc (complementary currency)", 2),
    CLF("CLF", 990, "Unidad de Fomento (funds code)", 4),
    CLP("CLP", 152, "Chilean Peso", 0),
    CNY("CNY", 156, "Chinese Yuan Renminbi", 2),
    COP("COP", 170, "Colombian Peso", 2),
    COU("COU", 970, "Unidad de Valor Real (UVR)", 2),
    CRC("CRC", 188, "Costa Rican Colon", 2),
    CUP("CUP", 192, "Cuban Peso", 2),
    CVE("CVE", 132, "Cape Verdean Escudo", 2),
    CZK("CZK", 203, "Czech Koruna", 2),

    // ── D ──────────────────────────────────────────────────────────────────
    DJF("DJF", 262, "Djiboutian Franc", 0),
    DKK("DKK", 208, "Danish Krone", 2),
    DOP("DOP", 214, "Dominican Peso", 2),
    DZD("DZD", 12,  "Algerian Dinar", 2),

    // ── E ──────────────────────────────────────────────────────────────────
    EGP("EGP", 818, "Egyptian Pound", 2),
    ERN("ERN", 232, "Eritrean Nakfa", 2),
    ETB("ETB", 230, "Ethiopian Birr", 2),
    EUR("EUR", 978, "Euro", 2),

    // ── F ──────────────────────────────────────────────────────────────────
    FJD("FJD", 242, "Fiji Dollar", 2),
    FKP("FKP", 238, "Falkland Islands Pound", 2),

    // ── G ──────────────────────────────────────────────────────────────────
    GBP("GBP", 826, "Pound Sterling", 2),
    GEL("GEL", 981, "Georgian Lari", 2),
    GHS("GHS", 936, "Ghanaian Cedi", 2),
    GIP("GIP", 292, "Gibraltar Pound", 2),
    GMD("GMD", 270, "Gambian Dalasi", 2),
    GNF("GNF", 324, "Guinean Franc", 0),
    GTQ("GTQ", 320, "Guatemalan Quetzal", 2),
    GYD("GYD", 328, "Guyanese Dollar", 2),

    // ── H ──────────────────────────────────────────────────────────────────
    HKD("HKD", 344, "Hong Kong Dollar", 2),
    HNL("HNL", 340, "Honduran Lempira", 2),
    HTG("HTG", 332, "Haitian Gourde", 2),
    HUF("HUF", 348, "Hungarian Forint", 2),

    // ── I ──────────────────────────────────────────────────────────────────
    IDR("IDR", 360, "Indonesian Rupiah", 2),
    ILS("ILS", 376, "Israeli New Shekel", 2),
    INR("INR", 356, "Indian Rupee", 2),
    IQD("IQD", 368, "Iraqi Dinar", 3),
    IRR("IRR", 364, "Iranian Rial", 2),
    ISK("ISK", 352, "Icelandic Krona", 0),

    // ── J ──────────────────────────────────────────────────────────────────
    JMD("JMD", 388, "Jamaican Dollar", 2),
    JOD("JOD", 400, "Jordanian Dinar", 3),
    JPY("JPY", 392, "Japanese Yen", 0),

    // ── K ──────────────────────────────────────────────────────────────────
    KES("KES", 404, "Kenyan Shilling", 2),
    KGS("KGS", 417, "Kyrgyzstani Som", 2),
    KHR("KHR", 116, "Cambodian Riel", 2),
    KMF("KMF", 174, "Comorian Franc", 0),
    KPW("KPW", 408, "North Korean Won", 2),
    KRW("KRW", 410, "South Korean Won", 0),
    KWD("KWD", 414, "Kuwaiti Dinar", 3),
    KYD("KYD", 136, "Cayman Islands Dollar", 2),
    KZT("KZT", 398, "Kazakhstani Tenge", 2),

    // ── L ──────────────────────────────────────────────────────────────────
    LAK("LAK", 418, "Lao Kip", 2),
    LBP("LBP", 422, "Lebanese Pound", 2),
    LKR("LKR", 144, "Sri Lankan Rupee", 2),
    LRD("LRD", 430, "Liberian Dollar", 2),
    LSL("LSL", 426, "Lesotho Loti", 2),
    LYD("LYD", 434, "Libyan Dinar", 3),

    // ── M ──────────────────────────────────────────────────────────────────
    MAD("MAD", 504, "Moroccan Dirham", 2),
    MDL("MDL", 498, "Moldovan Leu", 2),
    MGA("MGA", 969, "Malagasy Ariary", 2),
    MKD("MKD", 807, "Macedonian Denar", 2),
    MMK("MMK", 104, "Myanmar Kyat", 2),
    MNT("MNT", 496, "Mongolian Togrog", 2),
    MOP("MOP", 446, "Macanese Pataca", 2),
    MRU("MRU", 929, "Mauritanian Ouguiya", 2),
    MUR("MUR", 480, "Mauritian Rupee", 2),
    MVR("MVR", 462, "Maldivian Rufiyaa", 2),
    MWK("MWK", 454, "Malawian Kwacha", 2),
    MXN("MXN", 484, "Mexican Peso", 2),
    MXV("MXV", 979, "Mexican Unidad de Inversion (UDI)", 2),
    MYR("MYR", 458, "Malaysian Ringgit", 2),
    MZN("MZN", 943, "Mozambican Metical", 2),

    // ── N ──────────────────────────────────────────────────────────────────
    NAD("NAD", 516, "Namibian Dollar", 2),
    NGN("NGN", 566, "Nigerian Naira", 2),
    NIO("NIO", 558, "Nicaraguan Cordoba", 2),
    NOK("NOK", 578, "Norwegian Krone", 2),
    NPR("NPR", 524, "Nepalese Rupee", 2),
    NZD("NZD", 554, "New Zealand Dollar", 2),

    // ── O ──────────────────────────────────────────────────────────────────
    OMR("OMR", 512, "Omani Rial", 3),

    // ── P ──────────────────────────────────────────────────────────────────
    PAB("PAB", 590, "Panamanian Balboa", 2),
    PEN("PEN", 604, "Peruvian Sol", 2),
    PGK("PGK", 598, "Papua New Guinean Kina", 2),
    PHP("PHP", 608, "Philippine Peso", 2),
    PKR("PKR", 586, "Pakistani Rupee", 2),
    PLN("PLN", 985, "Polish Zloty", 2),
    PYG("PYG", 600, "Paraguayan Guarani", 0),

    // ── Q ──────────────────────────────────────────────────────────────────
    QAR("QAR", 634, "Qatari Riyal", 2),

    // ── R ──────────────────────────────────────────────────────────────────
    RON("RON", 946, "Romanian Leu", 2),
    RSD("RSD", 941, "Serbian Dinar", 2),
    RUB("RUB", 643, "Russian Ruble", 2),
    RWF("RWF", 646, "Rwandan Franc", 0),

    // ── S ──────────────────────────────────────────────────────────────────
    SAR("SAR", 682, "Saudi Riyal", 2),
    SBD("SBD", 90,  "Solomon Islands Dollar", 2),
    SCR("SCR", 690, "Seychellois Rupee", 2),
    SDG("SDG", 938, "Sudanese Pound", 2),
    SEK("SEK", 752, "Swedish Krona", 2),
    SGD("SGD", 702, "Singapore Dollar", 2),
    SHP("SHP", 654, "Saint Helena Pound", 2),
    SLE("SLE", 925, "Sierra Leonean Leone", 2),
    SOS("SOS", 706, "Somali Shilling", 2),
    SRD("SRD", 968, "Surinamese Dollar", 2),
    SSP("SSP", 728, "South Sudanese Pound", 2),
    STN("STN", 930, "Sao Tome and Principe Dobra", 2),
    SVC("SVC", 222, "Salvadoran Colon", 2),
    SYP("SYP", 760, "Syrian Pound", 2),
    SZL("SZL", 748, "Swazi Lilangeni", 2),

    // ── T ──────────────────────────────────────────────────────────────────
    THB("THB", 764, "Thai Baht", 2),
    TJS("TJS", 972, "Tajikistani Somoni", 2),
    TMT("TMT", 934, "Turkmenistan Manat", 2),
    TND("TND", 788, "Tunisian Dinar", 3),
    TOP("TOP", 776, "Tongan Paanga", 2),
    TRY("TRY", 949, "Turkish Lira", 2),
    TTD("TTD", 780, "Trinidad and Tobago Dollar", 2),
    TWD("TWD", 901, "New Taiwan Dollar", 2),
    TZS("TZS", 834, "Tanzanian Shilling", 2),

    // ── U ──────────────────────────────────────────────────────────────────
    UAH("UAH", 980, "Ukrainian Hryvnia", 2),
    UGX("UGX", 800, "Ugandan Shilling", 0),
    USD("USD", 840, "United States Dollar", 2),
    USN("USN", 997, "United States Dollar (Next day)", 2),
    UYI("UYI", 940, "Uruguay Peso en Unidades Indexadas (URUIURUI)", 0),
    UYU("UYU", 858, "Uruguayan Peso", 2),
    UYW("UYW", 927, "Unidad Previsional", 4),
    UZS("UZS", 860, "Uzbekistani Som", 2),

    // ── V ──────────────────────────────────────────────────────────────────
    VED("VED", 926, "Venezuelan Digital Bolivar", 2),
    VES("VES", 928, "Venezuelan Sovereign Bolivar", 2),
    VND("VND", 704, "Vietnamese Dong", 0),
    VUV("VUV", 548, "Vanuatu Vatu", 0),

    // ── W ──────────────────────────────────────────────────────────────────
    WST("WST", 882, "Samoan Tala", 2),

    // ── X – Special / Supranational ───────────────────────────────────────
    XAF("XAF", 950, "CFA Franc BEAC", 0),
    XAG("XAG", 961, "Silver (one troy ounce)", -1),
    XAU("XAU", 959, "Gold (one troy ounce)", -1),
    XBA("XBA", 955, "European Composite Unit (EURCO)", -1),
    XBB("XBB", 956, "European Monetary Unit (E.M.U.-6)", -1),
    XBC("XBC", 957, "European Unit of Account 9 (E.U.A.-9)", -1),
    XBD("XBD", 958, "European Unit of Account 17 (E.U.A.-17)", -1),
    XCD("XCD", 951, "East Caribbean Dollar", 2),
    XDR("XDR", 960, "Special Drawing Rights (IMF)", -1),
    XOF("XOF", 952, "CFA Franc BCEAO", 0),
    XPD("XPD", 964, "Palladium (one troy ounce)", -1),
    XPF("XPF", 953, "CFP Franc", 0),
    XPT("XPT", 962, "Platinum (one troy ounce)", -1),
    XSU("XSU", 994, "SUCRE", -1),
    XTS("XTS", 963, "Code reserved for testing", -1),
    XUA("XUA", 965, "ADB Unit of Account", -1),
    XXX("XXX", 999, "No currency", -1),

    // ── Y ──────────────────────────────────────────────────────────────────
    YER("YER", 886, "Yemeni Rial", 2),

    // ── Z ──────────────────────────────────────────────────────────────────
    ZAR("ZAR", 710, "South African Rand", 2),
    ZMW("ZMW", 967, "Zambian Kwacha", 2),
    ZWG("ZWG", 924, "Zimbabwe Gold", 2);


    /** ISO 4217 three-letter alphabetic code. */
    private final String code;

    /** ISO 4217 three-digit numeric code. */
    private final int numericCode;

    /** Official English name of the currency. */
    private final String name;

    /**
     * Number of digits after the decimal separator.
     * -1 indicates the concept of minor units is not applicable
     * (e.g. precious metals, special codes).
     */
    private final int minorUnit;

    Currency(String code, int numericCode, String name, int minorUnit) {
        this.code        = code;
        this.numericCode = numericCode;
        this.name        = name;
        this.minorUnit   = minorUnit;
    }


    public String getCode()        { return code; }
    public int    getNumericCode() { return numericCode; }
    public String getName()        { return name; }
    public int    getMinorUnit()   { return minorUnit; }


    /**
     * Returns the enum constant for the given alphabetic code (case-insensitive).
     *
     * @param code ISO 4217 alpha code, e.g. "USD"
     * @return matching Currency
     * @throws IllegalArgumentException if no match is found
     */
    public static Currency fromCode(String code) {
        if (code == null) throw new IllegalArgumentException("Code must not be null");
        String upper = code.toUpperCase();
        for (Currency c : values()) {
            if (c.code.equals(upper)) return c;
        }
        throw new IllegalArgumentException("Unknown ISO 4217 code: " + code);
    }

    /**
     * Returns the enum constant for the given numeric code.
     *
     * @param numericCode ISO 4217 numeric code, e.g. 840
     * @return matching Currency
     * @throws IllegalArgumentException if no match is found
     */
    public static Currency fromNumericCode(long numericCode) {
        for (Currency c : values()) {
            if (c.numericCode == numericCode) return c;
        }
        throw new IllegalArgumentException("Unknown ISO 4217 numeric code: " + numericCode);
    }

    // ── toString ───────────────────────────────────────────────────────────

    @Override
    public String toString() {
        return String.format("Currency{code='%s', numeric=%d, name='%s', minorUnit=%d}",
                code, numericCode, name, minorUnit);
    }
}
