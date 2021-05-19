package lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DaoAluno implements Dao<Aluno> {
    
    private List<Aluno> alunos = new ArrayList<Aluno>();

	@Override
	public Optional<Aluno> get(long id) {
		for (var a : alunos) {
			if (a.getId() == id) {
				return Optional.of(a);
			}
		}

		return Optional.empty();
	}

	@Override
	public List<Aluno> getAll() {
		return alunos;
	}

	@Override
	public void save(Aluno t) {
		this.alunos.add(t);
	}

	@Override
	public void update(Aluno t) {
		var existe = get(t.getId());
		
		if (existe.isPresent()) {
			var a = existe.get();
			a.setNome(t.getNome());
			a.setCpf(t.getCpf());
		} else {
			this.alunos.add(t);
		}
	
	}

	@Override
	public void delete(Aluno t) {
		var existe = get(t.getId());

		if (existe.isPresent()) {
			this.alunos.remove(t);
		} else {
			System.out.println("ERROR: Aluno -> " + t.getClass().getSimpleName() + "." + t.getId());
		}

	}
}
