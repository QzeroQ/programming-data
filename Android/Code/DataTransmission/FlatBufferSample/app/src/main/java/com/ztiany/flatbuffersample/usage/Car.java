// automatically generated by the FlatBuffers compiler, do not modify

package com.ztiany.flatbuffersample.usage;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Car extends Table {
  public static Car getRootAsCar(ByteBuffer _bb) { return getRootAsCar(_bb, new Car()); }
  public static Car getRootAsCar(ByteBuffer _bb, Car obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Car __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long id() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public long number() { int o = __offset(6); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public String describle() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer describleAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }

  public static int createCar(FlatBufferBuilder builder,
      long id,
      long number,
      int describleOffset) {
    builder.startObject(3);
    Car.addNumber(builder, number);
    Car.addId(builder, id);
    Car.addDescrible(builder, describleOffset);
    return Car.endCar(builder);
  }

  public static void startCar(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addId(FlatBufferBuilder builder, long id) { builder.addLong(0, id, 0L); }
  public static void addNumber(FlatBufferBuilder builder, long number) { builder.addLong(1, number, 0L); }
  public static void addDescrible(FlatBufferBuilder builder, int describleOffset) { builder.addOffset(2, describleOffset, 0); }
  public static int endCar(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}
