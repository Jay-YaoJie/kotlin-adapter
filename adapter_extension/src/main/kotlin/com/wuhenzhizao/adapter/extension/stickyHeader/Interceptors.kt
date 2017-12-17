package com.wuhenzhizao.adapter.extension.stickyHeader

import com.wuhenzhizao.adapter.interfaces.Interceptor

/**
 * Created by liufei on 2017/12/3.
 */
interface HeaderViewHolderCreateInterceptor<in VH> : Interceptor<VH> {
    /**
     * @param vh
     */
    fun onCreateHeaderViewHolder(vh: VH)
}

interface HeaderViewHolderBindInterceptor<in VH> : Interceptor<VH> {
    /**
     * @param position
     * @param vh
     */
    fun onBindHeaderViewHolder(position: Int, vh: VH)
}


interface HeaderClickInterceptor<in VH> : Interceptor<VH> {
    /**
     * @param stickyPosition
     * @param stickyId
     */
    fun onHeaderClick(stickyPosition: Int, stickyId: Long)
}