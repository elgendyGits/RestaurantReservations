package com.android.restaurantreservations.reservation;

import android.os.Bundle;
import android.util.Log;

import com.android.restaurantreservations.R;
import com.android.restaurantreservations.application.RestaurantReservationsApp;
import com.android.restaurantreservations.base.injector.Injection;
import com.android.restaurantreservations.base.repo.local.AppDatabase;
import com.android.restaurantreservations.base.view.BaseActivity;
import com.android.restaurantreservations.main.model.CustomerRepository;
import com.android.restaurantreservations.main.model.entity.Customer;
import com.android.restaurantreservations.main.presenter.CustomerPresenter;
import com.android.restaurantreservations.reservation.view.ReservationFragment;
import com.android.restaurantreservations.utils.FragmentUtils;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

import static com.android.restaurantreservations.application.RestaurantReservationsConstants.RESERVATION_FRAG_TAG;

public class ReservationActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        //show tables grid
        FragmentUtils.replaceFragment(this, new ReservationFragment(), R.id.fragment_reservation_container,
                false, RESERVATION_FRAG_TAG);

    }
}
