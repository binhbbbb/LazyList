package org.vaadin.client;

import com.vaadin.shared.communication.ClientRpc;

public interface LazyListClientRpc extends ClientRpc {

	public void moreItemsFetchedButNothingFound();

}