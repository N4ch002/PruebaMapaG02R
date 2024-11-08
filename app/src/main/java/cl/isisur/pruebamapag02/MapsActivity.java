package cl.isisur.pruebamapag02;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import cl.isisur.pruebamapag02.databinding.ActivityMapsBinding;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapa);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng VirginioGomez = new LatLng(-36.589738, -72.082471);
        LatLng HotelTierraParras = new LatLng(-36.622132, -72.129247);
        LatLng PlazaSantoDomingo = new LatLng(-36.601618, -72.106510);
        LatLng HotelAlicante = new LatLng(-36.578150, -72.099006);
        LatLng FeriaChillan = new LatLng(-36.611134, -72.101642);


        mMap.addMarker(new MarkerOptions().position(VirginioGomez).title("Instituto Profesional Virginio Gomez"));
        mMap.addMarker(new MarkerOptions().position(HotelTierraParras).title("Hotel Tierra de Parras"));
        mMap.addMarker(new MarkerOptions().position(PlazaSantoDomingo).title("Plaza Santo Domingo"));
        mMap.addMarker(new MarkerOptions().position(HotelAlicante).title("Hotel Alicante"));
        mMap.addMarker(new MarkerOptions().position(FeriaChillan).title("Feria Chillan"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(VirginioGomez));
        mMap.setMinZoomPreference(4.0F);
        mMap.setMaxZoomPreference(18.0f);


    }
}