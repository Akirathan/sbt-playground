package org.mayfa.example;

import java.util.Objects;
import scala.Option;
import scala.Product;
import scala.Product2;
import scala.Tuple2;
import scala.collection.Iterator;

public final class JCaseClass implements STrait {
  private final int start;
  private final int end;

  public JCaseClass(int start, int end) {
    this.start = start;
    this.end = end;
  }

  public static JCaseClass apply(final int start, final int end) {
    return new JCaseClass(start, end);
  }

  public static Option<Tuple2<Integer, Integer>> unapply(JCaseClass jCaseClass) {
    if (jCaseClass == null) {
      return Option.empty();
    } else {
      return Option.apply(new Tuple2<>(jCaseClass.start, jCaseClass.end));
    }
  }

  public JCaseClass copy(int start, int end) {
    return new JCaseClass(start, end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj instanceof JCaseClass other) {
      return start == other.start && end == other.end;
    }
    return false;
  }

  @Override
  public String name() {
    return "JCaseClass";
  }

  /*@Override
  public Object productElement(int n) {
    return switch (n) {
      case 0 -> start;
      case 1 -> end;
      default -> throw new IndexOutOfBoundsException(n);
    };
  }

  @Override
  public int productArity() {
    return 2;
  }

  @Override
  public Iterator<Object> productIterator() {
    return Product.super.productIterator();
  }

  @Override
  public String productPrefix() {
    return "JCaseClass";
  }

  @Override
  public boolean canEqual(Object that) {
    return that instanceof JCaseClass;
  }*/
}
