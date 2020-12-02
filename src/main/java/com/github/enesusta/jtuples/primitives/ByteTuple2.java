package com.github.enesusta.jtuples.primitives;

public final class ByteTuple2 {

    public final byte _1;
    public final byte _2;

    private ByteTuple2(final byte _1,
                      final byte _2) {
        this._1 = _1;
        this._2 = _2;
    }

    public static ByteTuple2 from(final byte _1,
                                  final byte _2) {
        return new ByteTuple2(_1, _2);
    }
}
