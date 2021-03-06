package com.pploder.jlwcv;

import java.util.ListIterator;

public class ListIteratorView<T> implements ListIterator<T> {

	private final ListIterator<T> original;

	public ListIteratorView(ListIterator<T> original) {
		this.original = original;
	}

	@Override
	public void add(T e) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public boolean hasNext() {
		return original.hasNext();
	}

	@Override
	public boolean hasPrevious() {
		return original.hasPrevious();
	}

	@Override
	public T next() {
		return original.next();
	}

	@Override
	public int nextIndex() {
		return original.nextIndex();
	}

	@Override
	public T previous() {
		return original.previous();
	}

	@Override
	public int previousIndex() {
		return original.previousIndex();
	}

	@Override
	public void remove() {
		throw new ViewMutationAttemptException();
	}

	@Override
	public void set(T e) {
		throw new ViewMutationAttemptException();
	}

}
