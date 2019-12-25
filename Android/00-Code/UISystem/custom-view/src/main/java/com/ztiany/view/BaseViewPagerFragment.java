package com.ztiany.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author Ztiany
 *         Email: ztiany3@gmail.com
 *         Date : 2017-08-05 15:44
 */
public abstract class BaseViewPagerFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.common_fragment_content, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TabLayout tableLayout = view.findViewById(R.id.tab);
        ViewPager viewPager = view.findViewById(R.id.view_pager);
        viewPager.setAdapter(getAdapter());
        tableLayout.setupWithViewPager(viewPager, true);
    }

    protected abstract PagerAdapter getAdapter();

    public abstract static class BasePagerAdapter extends PagerAdapter {

        private final String[] titles;

        protected BasePagerAdapter(String[] titles) {
            this.titles = titles;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }

        @Override
        public int getCount() {
            return titles.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view == object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, @NonNull Object object) {
            container.removeView((View) object);
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            View itemView = getItemView(container, position);
            container.addView(itemView);
            return itemView;
        }

        protected abstract View getItemView(ViewGroup container, int position);
    }

}