package com.ruoyi.common.utils.blade.tool;

/**
 * 生成的随机数类型
 *
 */
public enum RandomType {
	/**
	 * INT STRING ALL
	 */
	INT(RandomType.INT_STR),
	STRING(RandomType.STR_STR),
	ALL(RandomType.ALL_STR);

	private final String factor;

	/**
	 * 随机字符串因子
	 */
	private static final String INT_STR = "0123456789";
	private static final String STR_STR = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	private static final String ALL_STR = INT_STR + STR_STR;

	public String getFactor() {
		return factor;
	}

	RandomType(String factor) {
		this.factor = factor;
	}
}
