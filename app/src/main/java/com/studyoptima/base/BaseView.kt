interface BaseView {
    fun showLoading()  
    fun hideLoading()  
    fun showError(message: String)  
    fun showSuccess(message: String)  
}