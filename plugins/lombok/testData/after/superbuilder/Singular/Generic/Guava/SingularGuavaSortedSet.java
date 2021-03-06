// Generated by delombok at Tue Oct 01 19:52:43 GMT 2019

import com.google.common.collect.ImmutableSortedSet;

public class SingularGuavaSortedSet<T> {
  private ImmutableSortedSet rawTypes;
  private ImmutableSortedSet<Integer> integers;
  private ImmutableSortedSet<T> generics;
  private ImmutableSortedSet<? extends Number> extendsGenerics;

  public static void main(String[] args) {
  }


  @java.lang.SuppressWarnings("all")
  public static abstract class SingularGuavaSortedSetBuilder<T, C extends SingularGuavaSortedSet<T>, B extends SingularGuavaSortedSetBuilder<T, C, B>> {
    @java.lang.SuppressWarnings("all")
    private com.google.common.collect.ImmutableSortedSet.Builder<java.lang.Object> rawTypes;
    @java.lang.SuppressWarnings("all")
    private com.google.common.collect.ImmutableSortedSet.Builder<Integer> integers;
    @java.lang.SuppressWarnings("all")
    private com.google.common.collect.ImmutableSortedSet.Builder<T> generics;
    @java.lang.SuppressWarnings("all")
    private com.google.common.collect.ImmutableSortedSet.Builder<Number> extendsGenerics;

    @java.lang.SuppressWarnings("all")
    protected abstract B self();

    @java.lang.SuppressWarnings("all")
    public abstract C build();

    @java.lang.SuppressWarnings("all")
    public B rawType(final java.lang.Object rawType) {
      if (this.rawTypes == null) this.rawTypes = com.google.common.collect.ImmutableSortedSet.naturalOrder();
      this.rawTypes.add(rawType);
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B rawTypes(final java.lang.Iterable<?> rawTypes) {
      if (this.rawTypes == null) this.rawTypes = com.google.common.collect.ImmutableSortedSet.naturalOrder();
      this.rawTypes.addAll(rawTypes);
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B clearRawTypes() {
      this.rawTypes = null;
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B integer(final Integer integer) {
      if (this.integers == null) this.integers = com.google.common.collect.ImmutableSortedSet.naturalOrder();
      this.integers.add(integer);
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B integers(final java.lang.Iterable<? extends Integer> integers) {
      if (this.integers == null) this.integers = com.google.common.collect.ImmutableSortedSet.naturalOrder();
      this.integers.addAll(integers);
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B clearIntegers() {
      this.integers = null;
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B generic(final T generic) {
      if (this.generics == null) this.generics = com.google.common.collect.ImmutableSortedSet.naturalOrder();
      this.generics.add(generic);
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B generics(final java.lang.Iterable<? extends T> generics) {
      if (this.generics == null) this.generics = com.google.common.collect.ImmutableSortedSet.naturalOrder();
      this.generics.addAll(generics);
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B clearGenerics() {
      this.generics = null;
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B extendsGeneric(final Number extendsGeneric) {
      if (this.extendsGenerics == null) this.extendsGenerics = com.google.common.collect.ImmutableSortedSet.naturalOrder();
      this.extendsGenerics.add(extendsGeneric);
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B extendsGenerics(final java.lang.Iterable<? extends Number> extendsGenerics) {
      if (this.extendsGenerics == null) this.extendsGenerics = com.google.common.collect.ImmutableSortedSet.naturalOrder();
      this.extendsGenerics.addAll(extendsGenerics);
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B clearExtendsGenerics() {
      this.extendsGenerics = null;
      return self();
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "SingularGuavaSortedSet.SingularGuavaSortedSetBuilder(rawTypes=" + this.rawTypes + ", integers=" + this.integers + ", generics=" + this.generics + ", extendsGenerics=" + this.extendsGenerics + ")";
    }
  }


  @java.lang.SuppressWarnings("all")
  private static final class SingularGuavaSortedSetBuilderImpl<T> extends SingularGuavaSortedSetBuilder<T, SingularGuavaSortedSet<T>, SingularGuavaSortedSetBuilderImpl<T>> {
    @java.lang.SuppressWarnings("all")
    private SingularGuavaSortedSetBuilderImpl() {
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    protected SingularGuavaSortedSetBuilderImpl<T> self() {
      return this;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public SingularGuavaSortedSet<T> build() {
      return new SingularGuavaSortedSet<T>(this);
    }
  }

  @java.lang.SuppressWarnings("all")
  protected SingularGuavaSortedSet(final SingularGuavaSortedSetBuilder<T, ?, ?> b) {
    com.google.common.collect.ImmutableSortedSet<java.lang.Object> rawTypes = b.rawTypes == null ? com.google.common.collect.ImmutableSortedSet.<java.lang.Object>of() : b.rawTypes.build();
    this.rawTypes = rawTypes;
    com.google.common.collect.ImmutableSortedSet<Integer> integers = b.integers == null ? com.google.common.collect.ImmutableSortedSet.<Integer>of() : b.integers.build();
    this.integers = integers;
    com.google.common.collect.ImmutableSortedSet<T> generics = b.generics == null ? com.google.common.collect.ImmutableSortedSet.<T>of() : b.generics.build();
    this.generics = generics;
    com.google.common.collect.ImmutableSortedSet<Number> extendsGenerics = b.extendsGenerics == null ? com.google.common.collect.ImmutableSortedSet.<Number>of() : b.extendsGenerics.build();
    this.extendsGenerics = extendsGenerics;
  }

  @java.lang.SuppressWarnings("all")
  public static <T> SingularGuavaSortedSetBuilder<T, ?, ?> builder() {
    return new SingularGuavaSortedSetBuilderImpl<T>();
  }
}
