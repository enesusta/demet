package com.github.enesusta.jtuples.primitives;

public final class LongTuple2 {

    public final long _1;
    public final long _2;

    private LongTuple2(final long _1,
                      final long _2) {
        this._1 = _1;
        this._2 = _2;
    }

    public static LongTuple2 from(final long _1,
                                  final long _2) {
        return new LongTuple2(_1, _2);
    }
}
