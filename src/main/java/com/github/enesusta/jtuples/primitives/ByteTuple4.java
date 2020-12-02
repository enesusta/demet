package com.github.enesusta.jtuples.primitives;

public final class ByteTuple4 {

    public final byte _1;
    public final byte _2;
    public final byte _3;
    public final byte _4;

    private ByteTuple4(final byte _1,
                      final byte _2,
                      final byte _3,
                      final byte _4) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
    }

    public static ByteTuple4 from(final byte _1,
                                  final byte _2,
                                  final byte _3,
                                  final byte _4) {
        return new ByteTuple4(_1, _2, _3, _4);
    }
}
