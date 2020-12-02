package com.github.enesusta.jtuples.primitives;

public final class ByteTuple5 {

    public final byte _1;
    public final byte _2;
    public final byte _3;
    public final byte _4;
    public final byte _5;

    private ByteTuple5(final byte _1,
                      final byte _2,
                      final byte _3,
                      final byte _4,
                      final byte _5) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
        this._5 = _5;
    }

    public static ByteTuple5 from(final byte _1,
                                  final byte _2,
                                  final byte _3,
                                  final byte _4,
                                  final byte _5) {
        return new ByteTuple5(_1, _2, _3, _4, _5);
    }
}
