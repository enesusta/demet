package com.github.enesusta.jtuples.primitives;

import com.github.enesusta.jtuples.annotations.NotThreadSafe;

@NotThreadSafe
public final class FloatTuple2 {

    public final float _1;
    public final float _2;

    private FloatTuple2(final float _1,
                        final float _2) {
        this._1 = _1;
        this._2 = _2;
    }

    public static FloatTuple2 from(final float _1,
                                   final float _2) {
        return new FloatTuple2(_1, _2);
    }
}
