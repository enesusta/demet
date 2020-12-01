package com.github.enesusta.jtuples;

public final class Tuple3<A, B, C> {

    public final A _1;
    public final B _2;
    public final C _3;

    private Tuple3(final A _1,
                   final B _2,
                   final C _3) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
    }

    public static <A, B, C> Tuple3<A, B, C> from(final A _1,
                                                 final B _2,
                                                 final C _3) {
        return new Tuple3<>(_1, _2, _3);
    }
}
