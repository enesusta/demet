package com.github.enesusta.jtuples;

import com.github.enesusta.jtuples.annotations.NotThreadSafe;

@NotThreadSafe
public final class Tuple2<A, B> {

    public final A _1;
    public final B _2;

    private Tuple2(final A _1,
                   final B _2) {
        this._1 = _1;
        this._2 = _2;
    }

    public static <A, B> Tuple2<A, B> from(final A _1,
                                           final B _2) {
        return new Tuple2<>(_1, _2);
    }
}