package com.tiscon.code;

/**
 * 荷物の種類コード。
 *
 * @author Oikawa Yumi
 */
public enum PackageType implements CodeEnum {

    /** 段ボール */
    BOX(1, "段ボール"),
    /** サンプル */
    SAMPLE(5, "サンプル"),
    /** ベッド */
    BED(2, "ベッド"),
    /** 自転車 */
    BICYCLE(3, "自転車"),
    /** 洗濯機 */
    WASHING_MACHINE(4, "洗濯機"),
    /** 食器棚 */
    SHELF(6, "食器棚"),
    /** 本棚 */
    BOOKSHELF(7, "本棚"),
    /** 机 */
    TABLE(8, "机"),
    /** 冷蔵庫 */
    REFRIGERATOR(9, "冷蔵庫"),
    /** TV */
    TELEV(10, "TV");

    /** 荷物のラベル */
    private final String label;
    /** 荷物のラベルのコード */
    private final int code;

    /**
     * コンストラクタ。
     *
     * @param code  コード値
     * @param label ラベル
     */
    PackageType(int code, String label) {
        this.label = label;
        this.code = code;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public int getCode() {
        return code;
    }
}
