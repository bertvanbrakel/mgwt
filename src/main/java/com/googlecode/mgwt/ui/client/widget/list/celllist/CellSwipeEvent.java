/*
 * Copyright 2010 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.mgwt.ui.client.widget.list.celllist;

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.shared.GwtEvent;

/**
 * This event is fired when a cell {@link Cell} is swiped
 * 
 * @author Daniel Kurka
 * @version $Id: $
 */
public class CellSwipeEvent extends GwtEvent<CellSwipeHandler> {

  private static final GwtEvent.Type<CellSwipeHandler> TYPE = new GwtEvent.Type<CellSwipeHandler>();
  private final int index;
  private final Element targetElement;
  private final int x;
  private final int y;
  private final int deltaX;
  private final int deltaY;

  /**
   * Construct a cell selected event
   * 
   * @param index the index of the cell that was swiped
   * @param targetElement
   */
  public CellSwipeEvent(int index, Element targetElement,int x, int y, int deltaX,int deltaY) {
    this.index = index;
    this.targetElement = targetElement;
    this.x = x;
    this.y = y;
    this.deltaX = deltaX;
    this.deltaY = deltaY;
  }

  /** {@inheritDoc} */
  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<CellSwipeHandler> getAssociatedType() {
    return TYPE;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.google.gwt.event.shared.GwtEvent#dispatch(com.google.gwt.event.shared.EventHandler)
   */
  /** {@inheritDoc} */
  @Override
  protected void dispatch(CellSwipeHandler handler) {
    handler.onCellSwipe(this);

  }

  /**
   * <p>
   * getType
   * </p>
   * 
   * @return a {@link com.google.gwt.event.shared.GwtEvent.Type} object.
   */
  public static GwtEvent.Type<CellSwipeHandler> getType() {
    return TYPE;
  }

  /**
   * get the index of the selected cell
   * 
   * @return the index of the selected cell
   */
  public int getIndex() {
    return index;
  }

  public Element getTargetElement() {
    return targetElement;
  }

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getDeltaX() {
		return deltaX;
	}
	
	public int getDeltaY() {
		return deltaY;
	}

}
