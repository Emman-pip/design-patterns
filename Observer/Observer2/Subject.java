d/**
 * Subject
 */
public interface Subject {
	/*
	 * This interface will require a list of observers during the implementation
	 */
	public void registerUsers(Observer observer);

	public void removeUsers(Observer observer);

	public void notifyUsers();
}
