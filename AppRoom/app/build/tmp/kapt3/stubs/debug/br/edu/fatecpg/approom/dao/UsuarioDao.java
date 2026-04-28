package br.edu.fatecpg.approom.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\"\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b\"\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lbr/edu/fatecpg/approom/dao/UsuarioDao;", "", "buscarTodosUsuarios", "", "Lbr/edu/fatecpg/approom/model/Usuario;", "inserirUsuario", "", "usuario", "", "([Lbr/edu/fatecpg/approom/model/Usuario;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface UsuarioDao {
    
    @androidx.room.Query(value = "SELECT * FROM usuario")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<br.edu.fatecpg.approom.model.Usuario> buscarTodosUsuarios();
    
    @androidx.room.Insert()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object inserirUsuario(@org.jetbrains.annotations.NotNull()
    br.edu.fatecpg.approom.model.Usuario[] usuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}