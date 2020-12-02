package com.github.enesusta.jtuples.primitives;

import com.github.enesusta.jtuples.annotations.NotThreadSafe;

@NotThreadSafe
public final class ShortTuple2 {

    public final short _1;
    public final short _2;

    private ShortTuple2(short _1, short _2) {
        this._1 = _1;
        this._2 = _2;
    }

    public static ShortTuple2 from(final short _1,
                                   final short _2) {
        return new ShortTuple2(_1, _2);
    }
}
