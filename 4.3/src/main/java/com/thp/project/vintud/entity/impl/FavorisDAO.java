package com.thp.project.vintud.entity.impl;

public interface FavorisDAO {
	public boolean createFavoris(Favoris fav);
	public void Delete(Favoris fav);
	public void showFavouredAnnouncements();
	public void updateFavoris(Favoris fav ,int newAnnounceId);
	public boolean favouredOrNo(int idAnnonce);


}
