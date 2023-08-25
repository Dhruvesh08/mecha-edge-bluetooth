use log::info;

#[tokio::main(flavor = "current_thread")]
async fn main() -> bluer::Result<()> {
    env_logger::init();


    info!("Starting Bluetooth session");
    let session = bluer::Session::new().await?;

    info!("Getting default adapter");
    let adapter = session.default_adapter().await?;

    info!("Setting adapter powered");
    adapter.set_powered(true).await?;


    //after two minutes, stop the adapter
    tokio::time::sleep(tokio::time::Duration::from_secs(120)).await;
    
    info!("Stopping adapter");
    adapter.set_powered(false).await?;

    


    Ok(())

}