package com.sandro.restaurant;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.TextView;

public class Restaurant {

    private Snackbar snackbar;

    public Restaurant(Activity activity, @StringRes int resId, @Snackbar.Duration int duration) {
        this.snackbar = Snackbar.make(activity.getWindow().getDecorView().findViewById(android.R.id.content), resId, duration);
    }

    public Restaurant(Activity activity, @NonNull CharSequence text, @Snackbar.Duration int duration) {
        this.snackbar = Snackbar.make(activity.getWindow().getDecorView().findViewById(android.R.id.content), text, duration);
    }

    /**
     * Gets the {@link Snackbar}.
     *
     * @return the {@link Snackbar}.
     */
    public Snackbar getSnackBar() {
        return snackbar;
    }

    /**
     * Sets the text color of the action specified in
     * {@link #setAction(CharSequence, View.OnClickListener)}.
     */
    @NonNull
    public Restaurant setBackgroundColor(@ColorInt int color) {
        View snackbarView = this.snackbar.getView();

        snackbarView.setBackgroundColor(color);

        return this;
    }

    /**
     * Set the action to be displayed in this {@link Snackbar}.
     *
     * @param resId    String resource to display
     * @param listener callback to be invoked when the action is clicked
     */
    @NonNull
    public Restaurant setAction(@StringRes int resId, View.OnClickListener listener) {
        this.snackbar.setAction(resId, listener);

        return this;
    }

    /**
     * Set the action to be displayed in this {@link Snackbar}.
     *
     * @param text     Text to display
     * @param listener callback to be invoked when the action is clicked
     */
    @NonNull
    public Restaurant setAction(CharSequence text, final View.OnClickListener listener) {
        this.snackbar.setAction(text, listener);

        return this;
    }

    /**
     * Sets the text color of the action specified in
     * {@link #setAction(CharSequence, View.OnClickListener)}.
     */
    @NonNull
    public Restaurant setActionTextColor(ColorStateList colors) {
        this.snackbar.setActionTextColor(colors);

        return this;
    }

    /**
     * Sets the text color of the action specified in
     * {@link #setAction(CharSequence, View.OnClickListener)}.
     */
    @NonNull
    public Restaurant setActionTextColor(@ColorInt int color) {
        this.snackbar.setActionTextColor(color);

        return this;
    }

    /**
     * Update the text in this {@link Snackbar}.
     *
     * @param message The new text for the Toast.
     */
    @NonNull
    public Restaurant setText(@NonNull CharSequence message) {
        this.snackbar.setText(message);

        return this;
    }

    /**
     * Update the text in this {@link Snackbar}.
     *
     * @param resId The new text for the Toast.
     */
    @NonNull
    public Restaurant setText(@StringRes int resId) {
        this.snackbar.setText(resId);

        return this;
    }

    /**
     * Update the text color in this {@link Snackbar}.
     *
     * @param colors The new text for the Snackbar.
     */
    @NonNull
    public Restaurant setTextColor(ColorStateList colors) {
        View view = this.getSnackBar().getView();
        TextView tv = (TextView) view.findViewById(R.id.snackbar_text);

        tv.setTextColor(colors);

        return this;
    }

    /**
     * Update the text color in this {@link Snackbar}.
     *
     * @param color The new text for the Snackbar.
     */
    @NonNull
    public Restaurant setTextColor(@ColorInt int color) {
        View view = this.getSnackBar().getView();
        TextView tv = (TextView) view.findViewById(R.id.snackbar_text);

        tv.setTextColor(color);

        return this;
    }

    /**
     * Set how long to show the view for.
     *
     * @param duration either be one of the predefined lengths:
     *                 LENGTH_INDEFINITE, LENGTH_SHORT, LENGTH_LONG, or a custom duration in milliseconds.
     */
    @NonNull
    public Restaurant setDuration(@Snackbar.Duration int duration) {
        this.snackbar.setDuration(duration);

        return this;
    }

    /**
     * Return the duration.
     *
     * @see #setDuration
     */
    @Snackbar.Duration
    public int getDuration() {
        return this.snackbar.getDuration();
    }

    /**
     * Returns the {@link Snackbar}'s view.
     */
    @NonNull
    public View getView() {
        return this.snackbar.getView();
    }

    /**
     * Show the {@link Snackbar}.
     */
    public void show() {
        this.snackbar.show();
    }

    /**
     * Dismiss the {@link Snackbar}.
     */
    public void dismiss() {
        this.snackbar.dismiss();
    }

    /**
     * Set a callback to be called when this the visibility of this {@link Snackbar} changes.
     */
    @NonNull
    public Restaurant setCallback(Snackbar.Callback callback) {
        this.snackbar.setCallback(callback);

        return this;
    }

    /**
     * Return whether this {@link Snackbar} is currently being shown.
     */
    public boolean isShown() {
        return this.snackbar.isShown();
    }

    /**
     * Returns whether this {@link Snackbar} is currently being shown, or is queued to be
     * shown next.
     */
    public boolean isShownOrQueued() {
        return this.snackbar.isShownOrQueued();
    }

}
