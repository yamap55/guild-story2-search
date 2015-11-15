package com.yamap55.util;

public enum Shogo {
	SAITEI("最低な"), KUSAI("臭い"), NONE(""), MEIKOU("名工の"), MASHO("魔性の"), YADOTA("宿った"),
	DENSETSU("伝説の"), OSOROSHII("恐ろしい"), KOWARETA("壊れた");

	String shogoName;

	Shogo(String shogoName) {
		this.shogoName = shogoName;
	}

	public String getShogoName() {
		return shogoName;
	}
}
