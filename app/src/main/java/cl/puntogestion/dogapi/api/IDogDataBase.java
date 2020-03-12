package cl.puntogestion.dogapi.api;

import java.util.List;


import cl.puntogestion.dogapi.model.RazasLista;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface IDogDataBase {

    @GET("api/breeds/list/all")
    Call<RazasLista> listaRazas();

    @GET("api/breed/{raza}/images/random")
    Call<RazasLista> listaImagenes(@Path("raza") String raza);

    @GET("api/breed/{raza}/{subraza}/images/random")
    Call<RazasLista> listaImagenesSubraza(@Path("raza") String raza, @Path("subraza") String subraza);

}
