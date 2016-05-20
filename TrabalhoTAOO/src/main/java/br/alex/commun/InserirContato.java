package br.alex.commun;

import org.hibernate.Session;

import br.alex.persistencia.HibernateUtil;

public class InserirContato {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Contato c = new Contato("Fulano ", "Dos Fulanos");
		
		session.persist(c);
//		List<Telefone> listPhone = new ArrayList<Telefone>();
//		for (int j = 0; j < 5; j++) {
//			Telefone phone = new Telefone(45, 99785542);
//			phone.setContato(c);
//			listPhone.add(phone);
//		}

		session.getTransaction().commit();

		session.close();

		HibernateUtil.finalizar();

	}

}
