package com.thp.project.vintud.entity.impl;

public interface FavorisDAO {
	public void createFavoris(Favoris fav);
	public void Delete(Favoris fav);
	public void showFavouredAnnouncements();
	public void updateFavoris(Favoris fav ,int newAnnounceId);


}
